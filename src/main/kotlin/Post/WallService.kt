package Post

object WallService {

    private var id = 0
    private var posts = emptyArray<Post>()

    fun add (post: Post):Post {
        posts += post.copy(id=id++)
        return posts[posts.lastIndex]
    }

    fun getPostById (id:Int):Post {
        return posts[id]
    }

    fun update(post: Post): Boolean {
        if (posts.contains(post)) {
            val id = post.id
            posts[id] = post.copy(ownerId = posts[id].ownerId, date = posts[id].date)
            return true
        } else return false
    }

}