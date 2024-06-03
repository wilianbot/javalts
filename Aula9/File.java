package Aula9;

public class File {
    /* Para trabalhar com arquivos, utilizamos a classe File do pacote java.
     * A classe File implementa método para manipular arquivos manidos pelo sistema operacional.
     * Utiliza-se a mesma classe File para tratamento dos diretórios e arquivos.
     */

     public static void main(String[] args) {
         // Exemplo
         File f = new File("c:\\arquivos\\ler.txt");
         if(!f.exist()){
             System.out.println("Arquivo:" + arquivo + " não existe");
         }
    }


    /* ================= METODOS - Tratamento de arquivos ============== 
     * getName: Retorna o nome do arquivo
     * renameTo: Renomeia o arquivo
     * exist: Verifica se o arquivo existe
     * canWrite: Retorna true se um arquivo pode ser escrito
     * canRead: Retorna true se um aqruivo pode ser lido
     * isFile: Retorna true se o caminho definido é um arquivo
     * lastmodified: Retorna a data da ultima alteração do arquivo
     * length: Retorna ao tamanho do arquivo
     * delete: Deleta o arquivo
    */

    /* ================ METODOS - Tratamento de diretórios =============
     * getPath: Retorna o nome do diretório
     * getAbsolutePath: Retorna o nome do diretório a partir da raiz
     * getParent: Retorna os diretórios acima do arquivo
     * isDirectory: Retorna true se o caminho definido é um diretório
     * isAbsolute: Retorna true se um caminho é absoluto
     * mkdir: Cria um diretório
     * list: Retorna a lista de arquivo presentes em um diretório
     */
}
