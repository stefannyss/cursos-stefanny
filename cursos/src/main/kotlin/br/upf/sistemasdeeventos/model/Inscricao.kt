package br.upf.sistemasdecursos.model

import java.time.LocalDateTime

data class Inscricao(
    val id: Long? = null,
    val usuario: Usuario,
    val data: LocalDateTime = LocalDateTime.now()
)
