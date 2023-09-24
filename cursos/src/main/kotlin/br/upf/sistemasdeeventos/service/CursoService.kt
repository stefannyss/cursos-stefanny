package br.upf.sistemasdecursos.service

import br.upf.sistemasdecursos.converters.CursoConverter
import br.upf.sistemasdecursos.dtos.CursoDTO
import br.upf.sistemasdecursos.dtos.CursoResponseDTO
import br.upf.sistemasdecursos.model.Curso
import br.upf.sistemasdecursos.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService(
    val repository: CursoRepository,
    val converter: CursoConverter
) {

    fun listar(): List<CursoResponseDTO> {
        return repository.findAll()
            .map(converter::toCursoResponseDTO)
    }

    fun buscarPorId(id: Long): CursoResponseDTO {
        val curso = repository.findAll().first{ it.id == id }
        return converter.toCursoResponseDTO(curso)
    }

    fun cadastrar(dto: CursoDTO) {
        repository.cadastrar(converter.toCurso(dto))
    }

    fun atualizar(id: Long, dto: CursoDTO) {
        val curso = repository.findAll().first { it.id == id }
        repository.update(curso.copy(
            nome = dto.nome,
            data = dto.data,
            dataInicioInsc = dto.dataInicioInsc,
            dataFimInsc = dto.dataFimInsc,
            descricao = dto.descricao,
            status = dto.status
        ))
    }

}