fun main(){
    //val post = Post(1,2);
    val original = Post(
        id = 0,
        AuthorId = 1,
        AuthorName = "test",
        content = "test content",
        date = "01.01.2021",
        likes = 12
    )

    val WallService = WallService()
    println(WallService.add(original))


    val original2 = Post(
        id = 0,
        AuthorId = 1,
        AuthorName = "test",
        content = "test content 22",
        date = "01.01.2021",
        likes = 112
    )
    println(WallService.add(original2))


    val original3 = Post(
        id = 0,
        AuthorId = 1,
        AuthorName = "test2",
        content = "test content 22 fddsfsfsdfs",
        date = "01.01.2021",
        likes = 12
    )
    println(WallService.add(original3))


    val original4 = Post(
        id = 1,
        AuthorId = 1,
        AuthorName = "Name2",
        content = "updated content of post with id=1",
        date = "02.01.2021",
        likes = 22
    )

    if(WallService.update(original4))
        println("post id=1 successfuly updated")
    else
        println("no such id found")

    println(WallService.showPostById(1))


}