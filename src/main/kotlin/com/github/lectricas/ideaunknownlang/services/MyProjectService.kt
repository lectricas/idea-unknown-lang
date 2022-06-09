package com.github.lectricas.ideaunknownlang.services

import com.intellij.openapi.project.Project
import com.github.lectricas.ideaunknownlang.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
