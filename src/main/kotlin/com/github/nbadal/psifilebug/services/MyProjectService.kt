package com.github.nbadal.psifilebug.services

import com.intellij.openapi.project.Project
import com.github.nbadal.psifilebug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
