data class Post (
    val id:Long,
    val AuthorId:Long,
    val AuthorName:String,
    val content:String,
    val date:String,
    val likes: Int = 0
)

class WallService {
    private var posts = emptyArray<Post>()
    private var currentUniqId:Long=1


    fun add(post: Post): Post {
        posts += post.copy(id = currentUniqId)
        currentUniqId++
        return posts.last()
    }
    fun update(post2: Post): Boolean {
        for ((index,post) in posts.withIndex()) {
            if(post.id == post2.id) {
               posts[index] = post.copy(content = post2.content,AuthorName=post2.AuthorName,likes=post2.likes,date=post2.date)
               return true
            }
        }
        return false
    }

    fun showPostById(id: Long) {

        for ((index,post) in posts.withIndex()) {
            if(post.id == id) {
                println(posts[index])
            }
        }

    }

}