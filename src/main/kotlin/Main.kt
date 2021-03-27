import Post.Post
import Post.WallService

fun main() {

    WallService.add(Post())
    println(WallService.getPostById(0))
    val newPost = Post(id = 3, ownerId = 20, date = 2000, createdBy = 20)
    println(newPost)
    println(WallService.update(newPost))
    println("=====================================================")
    println(WallService.getPostById(0))
//    WallService.update(newPost)
//    println(WallService.getPostById(0))
}