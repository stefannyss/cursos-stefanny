package br.upf.sistemasdecursos.repository

import br.upf.sistemasdecursos.model.Curso
import br.upf.sistemasdecursos.model.StatusCurso
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
class CursoRepository(
    private var cursos: MutableList<Curso>) {

    private var idCont = 4L

    init {
        val hoje = LocalDate.now()
        val curso = Curso(
            id = 1,
            nome = "Análise e Desenvolvimento de Sistemas",
            data = hoje,
            dataInicioInsc = hoje.atStartOfDay().plusDays(10),
            dataFimInsc = hoje.atStartOfDay().plusDays(20),
            descricao = "Curso de Análise e Desenvolvimento de Sistemas na UPF",
            status = StatusCurso.PREVISTO
        )
        val curso2 = Curso(
            id = 2,
            nome = "Ciência da Computação",
            data = hoje,
            dataInicioInsc = hoje.atStartOfDay().plusDays(10),
            dataFimInsc = hoje.atStartOfDay().plusDays(20),
            descricao = "Curso de Ciência da Computação na UPF",
            status = StatusCurso.PREVISTO
        )
        val curso3 = Curso(
            id = 3,
            nome = "Engenharia da Computação,
            data = hoje,
            dataInicioInsc = hoje.atStartOfDay().plusDays(10),
            dataFimInsc = hoje.atStartOfDay().plusDays(20),
            descricao = "Curso de Engenharia da Computação na UPF",
            status = StatusCurso.PREVISTO
        )
        cursos = mutableListOf(
            curso,
            curso2,
            curso3)
    }

    fun findAll() = cursos
    fun cadastrar(curso: Curso) {
        cursos.add(curso.copy(id = idCont++))
    }

    fun update(curso: Curso) {
        cursos.removeIf { it.id == curso.id }
        cursos.add(curso)
    }
}