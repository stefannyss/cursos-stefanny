package br.upf.sistemasdecursos.dtos

import br.upf.sistemasdecursos.model.StatusCurso
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Null
import java.time.LocalDate
import java.time.LocalDateTime

data class CursoDTO(
    @field:NotBlank(message = "Curso sempre deve ter um nome")
    val nome: String,
    @field:NotNull(message = "Curso sempre deve ter uma data")
    val data: LocalDate,
    val dataInicioInsc: LocalDateTime,
    val dataFimInsc: LocalDateTime,
    val descricao: String,
    val status: StatusCurso
)
