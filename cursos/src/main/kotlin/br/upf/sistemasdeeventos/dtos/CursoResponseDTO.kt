package br.upf.sistemasdecursos.dtos

import br.upf.sistemasdecursoss.model.Inscricao
import br.upf.sistemasdecursoss.model.StatusCurso
import java.time.LocalDate
import java.time.LocalDateTime

data class CursoResponseDTO(
    val nome: String,
    val data: LocalDate,
    val dataInicioInst: LocalDateTime,
    val dataFimInsc: LocalDateTime,
    val descricao: String,
    val status: StatusCurso,
    val inscritos: List<Inscricao>
)
