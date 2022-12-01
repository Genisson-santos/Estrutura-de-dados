package AV1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import lista.Lista;
import lista.ListaEncOrdenada;

public class Cartela implements ICartelaJogo{

    protected Lista<Lista<NumeroCartela>> dados;
    protected Integer identificador = 0;
    protected Date dataGeracao;
    
 private final Random random = new Random();

    
    private static int Numerocartela = 0;
    
    String dataDeGeracao = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());

   
    public Cartela( int tamanhoMatriz, int identificador ) throws Exception {
        this(tamanhoMatriz, tamanhoMatriz, identificador);
        
    }
   
    public int[][] gerarCartela(int m, int n) {
        final int[][] cartela = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cartela[i][j] = random.nextInt(59) + 1;
            }
        }
        return (cartela);
    }
    
    
    /**
     * Cria a cartela com os números conforme a matriz N x M.
     * Um número identificador (geralmente um sequencial) deverá ser informado.
     * @param N
     * @param M
     * @param identificador
     * @throws Exception
     */
    public Cartela( int N, int M, int identificador ) throws Exception {
    	  identificador = Numerocartela;
          Numerocartela++;
          

    }

    public int[][] getDados() throws Exception {
        int N = this.dados.getTamanho();
        int M = this.dados.get(0).getTamanho();
        int[][] valores = new int[N][M];
        for (int i = 0; i < N; i++) {
            Lista<NumeroCartela> linha = dados.get(i);
            for (int j = 0; j < M; j++) {
                valores[i][j] = linha.get(j).getNumero();
            }
        }
        return valores;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    /**
     * Procura se o número está na cartela e o marca como sorteado.
     * @param numero número que acabou de ser sorteado e que deve ser marcado na cartela
     * @throws Exception
     */
    @Override
    public void marcarNumeroSorteado(int numero) throws Exception {
        //TODO: Não implementado
       throw new Exception("Método não implementado");
    }

    /**
     * Identifica se a cartela é vencedora conforme o parâmetro @verificarPorLinha
     * @param verificarPorLinha caso verdadeiro (@true) o programa deverá verificar
    por linha (horizontal). Caso seja falso (@false) deverá verificar se todos os números
    foram sorteados.
     *
     * @return
     * @throws Exception
     */
    @Override
    public boolean ehCartelaVencedora(boolean verificarPorLinha) throws Exception {
        //TODO: Não implementado
        throw new Exception("Método não implementado");
    }


    /**
     * Retorna uma lista encadeada ordenada com os números da cartela.
     * Poderão existir números duplicados
     * @return
     */

    public ListaEncOrdenada<Integer> getNumerosNaoSorteados() {
        return null;
    }

    /**
     * Deverá observar se os números das duas cartelas são iguais por linha.
     * @param iCartelaJogo
     * @return
     */
    @Override
    public int compareTo(ICartelaJogo iCartelaJogo) {
        return 0;
    }

    private static int idsGeados = 0;

    boolean estahEmUso= false;
    @Override
    public void setEstahEmUso(boolean estahEmUso) {
        this.estahEmUso = estahEmUso;
    }

    @Override
    public boolean estahEmUso() {
        return estahEmUso;
    }

    public static ICartelaJogo gerarCartelaJogo(int N, int M) throws Exception {
        return new Cartela(N, M, ++idsGeados);
    }


}
