package com.example.accountbook.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import androidx.recyclerview.widget.RecyclerView
import com.example.accountbook.R
import com.example.accountbook.data.Item
import com.example.accountbook.data.ItemType

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_dashboard, container, false)

    private val income = listOf(
        Item(ItemType.INCOME, 123456789, 50000, "용돈"),
        Item(ItemType.INCOME, 123456789, 100000, "월급"),
        Item(ItemType.INCOME, 123456789, 20000, "과외"),
        Item(ItemType.INCOME, 123456789, 25000, "용돈"),
        Item(ItemType.INCOME, 123456789, 30000, "지식인"),
        Item(ItemType.INCOME, 123456789, 40000, "보너스"),
        Item(ItemType.INCOME, 123456789, 55000, "세뱃돈"),
    )

    private val expenditure = listOf(
        Item(ItemType.EXPENDITURE, 123456789, 50000, "피자헛"),
        Item(ItemType.EXPENDITURE, 123456789, 60000, "도미노피자"),
        Item(ItemType.EXPENDITURE, 123456789, 20000, "피자스쿨"),
        Item(ItemType.EXPENDITURE, 123456789, 25000, "피자나라 치킨공주"),
        Item(ItemType.EXPENDITURE, 123456789, 30000, "BBQ"),
        Item(ItemType.EXPENDITURE, 123456789, 50000, "교촌치킨"),
        Item(ItemType.EXPENDITURE, 123456789, 50000, "호식이 두마리치킨"),
        Item(ItemType.EXPENDITURE, 123456789, 50000, "노랑통닭"),
        Item(ItemType.EXPENDITURE, 123456789, 50000, "프라닭 치킨"),
        Item(ItemType.EXPENDITURE, 123456789, 50000, "BHC"),
    )

    private val incomeAdapter = ItemAdapter(income)
    private val expenditureAdapter = ItemAdapter(expenditure)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeRecyclerView(view, R.id.rvIncome, incomeAdapter)
        initializeRecyclerView(view, R.id.rvExpenditure, expenditureAdapter)
    }

    private fun initializeRecyclerView(root: View, recyclerViewId: Int, adapter: ItemAdapter) {
        val recyclerView = root.findViewById<RecyclerView>(recyclerViewId)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), VERTICAL, false)
        recyclerView.adapter = adapter
    }

    companion object {
        fun newInstance() = DashboardFragment()
    }
}