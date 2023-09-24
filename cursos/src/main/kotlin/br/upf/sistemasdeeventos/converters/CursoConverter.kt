package br.upf.sistemasdecursos.converters

import br.upf.sistemasdecursos.dtos.CursoDTO
import br.upf.sistemasdecursos.dtos.CursoResponseDTO
import br.upf.sistemasdecursos.model.Curso
import org.springframework.stereotype.Component

@Component
class CursoConverter {

    fun toCurso(dto: CursoDTO): Curso {
        return Curso(
            nome = dto.nome,
            data = dto.data,
            dataInicioInsc = dto.dataInicioInsc,
            dataFimInsc = dto.dataFimInsc,
            descricao = dto.descricao,
            status = dto.status
        )
    }

    fun toCursoResponseDTO(curso: Curso): CursoResponseDTO {
        return CursoResponseDTO(
            nome = curso.nome,
            data = curso.data,
            dataInicioInst = curso.dataInicioInsc,
            dataFimInsc = curso.dataFimInsc,
            descricao = curso.descricao,
            status = curso.status,
            inscritos = curso.inscritos
        )
    }

}