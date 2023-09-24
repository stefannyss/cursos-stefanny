package br.upf.sistemasdecursos.model

import java.time.LocalDate
import java.time.LocalDateTime

data class Curso(
    val id: Long? = null,
    val nome: String,
    val data: LocalDate,
    val dataInicioInsc: LocalDateTime,
    val dataFimInsc: LocalDateTime,
    val descricao: String,
    val status: StatusCurso,
    val inscritos: List<Inscricao> = listOf()
)
