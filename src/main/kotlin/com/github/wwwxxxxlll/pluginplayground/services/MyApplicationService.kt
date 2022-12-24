package com.github.wwwxxxxlll.pluginplayground.services

import com.github.wwwxxxxlll.pluginplayground.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
