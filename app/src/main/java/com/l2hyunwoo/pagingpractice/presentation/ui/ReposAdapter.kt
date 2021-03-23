package com.l2hyunwoo.pagingpractice.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.l2hyunwoo.pagingpractice.R
import com.l2hyunwoo.pagingpractice.databinding.ItemRepoBinding
import com.l2hyunwoo.pagingpractice.model.Repo

class ReposAdapter : PagingDataAdapter<Repo, ReposAdapter.RepoViewHolder>(REPO_COMPARATOR) {
    class RepoViewHolder(private val binding: ItemRepoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(repo: Repo) {
            binding.repo = repo
        }
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemRepoBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_repo, parent, false)
        return RepoViewHolder(binding)
    }

    companion object {
        private val REPO_COMPARATOR = object : DiffUtil.ItemCallback<Repo>() {
            override fun areItemsTheSame(oldItem: Repo, newItem: Repo): Boolean =
                oldItem.fullName == newItem.fullName

            override fun areContentsTheSame(oldItem: Repo, newItem: Repo): Boolean =
                oldItem == newItem
        }
    }
}