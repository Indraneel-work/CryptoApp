package com.plcoding.cryptocurrencyapp.domain.model

import com.plcoding.cryptocurrencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coindId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>,
)
