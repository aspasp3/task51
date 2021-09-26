package ru.netology

import WallService
import Post
import org.junit.Test

import org.junit.Assert.*


class WallServiceTest {
    @Test
    fun updateExisting() {
        val service = WallService()

        service.add(Post (0,3,"testName","test content","03.01.2021",34))
        service.add(Post (0,4,"testName2","test content 2","03.01.2021",34))
        service.add(Post (0,3,"testName","test content 3" ,"03.01.2021",34))

        val update = Post (1,3,"testName","test content","03.01.2021",44)
        val result = service.update(update)

        assertTrue(result)
    }
    @Test
    fun addNotZero() {
        val service = WallService()
        val result = service.add(Post (0,3,"testName","test content","03.01.2021",34))
        var booleanResult = true

        if(result.id == 0L)
            booleanResult = false

        assertTrue(booleanResult)
    }
}