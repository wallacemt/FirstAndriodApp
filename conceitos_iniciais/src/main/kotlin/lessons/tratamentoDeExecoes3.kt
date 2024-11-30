import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){
    val arquivo = File("C:\\Users\\walla\\OneDrive\\Meus Cursos\\Exercicio de OUTRAS LINGUAGENS\\KOTLIN\\conceitos_iniciais\\src\\main\\kotlin\\lessons\\passoAPasso.txt")
    try{
        Scanner(arquivo).use{l ->
            while(l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch(e:FileNotFoundException){
        println("Falha ao ler o arquivo")
        //e.printStackTrace;
    }
}

fun main(){
    ler_arquivo()

}