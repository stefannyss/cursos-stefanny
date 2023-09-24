package br.upf.sistemasdecursos.controller

import br.upf.sistemasdecursos.dtos.CursooDTO
import br.upf.sistemasdecursos.dtos.CursoResponseDTO
import br.upf.sistemasdecursos.service.CursoService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cursoss")
class CursoController(
    val service: CursosService
) {

    @GetMapping
    fun listar(): List<CursosResponseDTO> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): CursosResponseDTO {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar (@RequestBody @Valid dto: CursosDTO) {
        service.cadastrar(dto)
    }

    @PutMapping("/{id}")
    fun atualizar(@PathVariable id: Long, @RequestBody @Valid dto: CursosDTO) {
        service.atualizar(id, dto)
    }

}