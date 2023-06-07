package br.com.catolica.conta.Model;

/**Ola amigos espero que estajam bem irei propor ideias de como sera nossa
 * logica de trasacao, seja de transferencia quanto de deposito e saque:
 * 
 * Iremos passar o bando de dados de onde estao as contas como uma lista
 * ou uma DAO com as contas, como referencia.
 * 
 * Depositar:
 * public void Depositar(double valor){
 *      this.valorEmConta += valor;
 * 
 * Nessa situacao amigos cabe um possivel tratamento de erros caso o valor
 * inserido seja negativo, se nao for possivel aconselho colocar uma condicional
 * se o valor for < 0 nao passa pela condicao.
 * }
 * 
 * Sacar:
 * public void Sacar(double valor){
 *      this.valorEmConta -= valor;
 * Nessa situacao tambem cabe um tratamento de erro se o valorEmConta apos o
 * saque for negativo ou seja < 0 nao ocorre um erro, ou colocar uma condicao
 * de valor maior que valorEmConta nao acontece nada, aconselho utilizar se
 * possivel os tratamentos de erro para que tenha tratamento de erro no codigo.
 * }
 * 
 * Transacao:
 * Na transacao amigos vamos precisar fazer algo parecido com o que Erlon
 * fez nas aulas, fazer um FOR para buscar tanto o numero da conta de quem
 * recebe quanto de quem retira o dinheiro, eu acoselho
 * mudar de int para string a variavel conta para que possamos utlizar 
 * o equals para verificar se aconta existe e fazer a transferencia.
 * 
 * public void T Transacao(String contaRetira, String contaRecebe, double valor){
 *      for (T objeto : base) {
 *          if (objeto.getConta().equals(contaRetira) && objeto.getConta().equals(contaRecebe) ) { 
 *              this.contaRetira.conta -= valor;
 *              this.contaRecebe.conta += valor;
 * 
 * Vale lembrar que e so uma ideia, tambem cabe tratamento de erros ou condicionais
 * dentro de trasacoes.
 * }
 * 
 * 
*/
