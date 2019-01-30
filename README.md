-Funcionalidades



 O projeto Folha de Pagamento é um sistema de administração de funcionários , onde é possivel :

     .Adicionar Funcionários. (métodojButton1ActionPerformed da classe PayrollGUI)

     .Remover Funcionários. (método jButton3ActionPerformed da classe PayrollGUI)

     .Lançar o cartão de ponto de um funcionário. (método jButton4ActionPerformed da classe PayrollGUI)

     .Lancar o resultado de uma venda feita por um funcionário comissionado. (método jButton5ActionPerformed da classe PayrollGUI)

     .Lançar uma taxa de serviço para um funcionario.(método jButton6ActionPerformed da classe PayrollGUI)

     .Colocar um empregado no Sindicato. (método jButton12ActionPerformed da classe PayrollGUI) 

     .Rodar a folha de pagamento dos funcionários do dia. (método jButton8ActionPerformed da classe PayrollGUI)

     .Desfazer uma das ações acima. (método jButton9ActionPerformed da classe PayrollGUI)

     .Refazer uma das ações desfeita anteriormente. (método jButton10ActionPerformed da classe PayrollGUI)

     .Mudar a agenda de pagamento de um funcionário. (método jButton11ActionPerformed da classe PayrollGUI)

     .Criar um novo tipo de agenda de funcionários. (método jButton11ActionPerformed da classe PayrollGUI)

     .Mudar detalhes de um empregado. (método jButton7ActionPerformed da classe PayrollGUI)

-Classes : 
    O projeto conta com 9 classes , sendo 3 de Interface Gráfica , sendo elas Commisioned,EditEmpGUI,Employee,Hourly,PayrollGUI,PayrollRefactored(Main),Salaried,Schedule,ScheduleGUI.

 
Classe Employee :


      .Motivação : Criar um novo funcionário genérico , sem as especificações dos tipos especificos.

      .Solução : Com essa classe criar um funcionário pertencente a um dos tipos possiveis se torna muito mais fácil , pois ela une todas as características em comum dos tipos.

      .Vantagem : A classe ter subclasses permite a criação de diversos tipos de funcionário, sem a necessidade de criar mais classes com as mesmas caracteristicas.

 -Heranças de Employee : 

    
     Classe Hourly :

      .Motivação : Necessidade de armazenar dados de um funcionário horista.

      .Solução : A classe armazena dados de um funcionário horista , tendo as informações exclusivas do tipo.

      .Vantagem : Capacidade de distinguir facilmente se o empregado é horista,tendo as informações e ações exclusivas para este tipo ,como o salário ser definido pelas horas trabalhadas no dia.

    
     Classe Salaried :

      .Motivação : Necessidade de armazenar dados de um funcionário assalariado.

      .Solução : A classe armazena os dados de um funcionário assalariado, tendo as informações exclusivas do tipo.

      .Vantagem : Capacidade de distinguir facilmente um empregado assalariado , tendo as informações e ações exclusivas de assalariados , como a agenda de recebimento ser no ultimo dia util do mês.

    
     Classe Commisioned :

      .Motivação : Necessidade de amazenar dados de um funcionário comissionado.

      .Solução : A classe armazena os dados de um funcionário comissionado , contendo as informações do tipo.

      .Vantagem : Possibilidade de distinguir um empregado comissionado facilmente , podendo fazer ações exclusivas de comissionados , como lançar um resultado de venda e ganhar a taxa de comissão.


 Classe PayrollRefactored :

      .Motivação : Ser a classe principal do sistema , inicializando as restantes.

      .Solução : Com esta classe , a chamada das restantes se torna mais organizada.

      .Vantagem : Maior organização da estrutura do código.

      .Desvantagem : Pouca quantidade de coisas a se fazer na mesma.


 Classe Schedule :

      .Motivação : Criar agendas de pagamento.
      
      .Solução : Com a criação da classe , criar outras agendas de pagamento além das padrão.
      
      .Vantagem : Possibilidade de criar agendas diferentes para os funcionarios terem, podendo assim possuirem maior escolha sobre o pagamento.
      

 Classe PayrollGUI :

      .Motivação : Criar uma janela para mostrar as opções possiveis de fazer no programa.

      .Solução : A classe possibilita a opção de qual das funcionalidades apontadas antes fazer.

      .Vantagem : Mostrar as opções possiveis de forma gráfica.

      .Desvantagem : Diminuição da velocidade de execução do programa.


 Classe EditEmpGUI :

      .Motivação : Editar informações de um empregado de forma mais simples.

      .Solução : A caixa de escolhas (uma das variáveis da classe) permite escolher qual informação vai ser editada.

      .Vantagem : Possibilidade de escolha de forma mais simples , sem haver casos onde o usuário escolhe opções impossíveis.	



 Classe ScheduleGUI:

      .Motivação : Possibilitar o empregado de escolher uma das agendas criadas com Schedule.

      .Solução : Uma lista mostrando as agendas disponíveis , e caso o empregado queira , a criação de uma nova.

      .Vantagem : Possibilidade de criar/mudar de agenda de forma mais simples.



-Extensibilidade:

      .Motivação : A necessidade de trabalhar com vários objetos muito parecidos sem haver a necessidade de declarar as mesmas caracteristicas em comum.

      .Solução : Fazer esses objetos serem herdarem de uma mesma classe o que tinham em comum.

      .Vantagem : A não necessidade de criar várias classes parecidas, ao invés disso criar uma subclasse da classe que contem as semelhanças.



-Distribuição dos Métodos :

 Métodos de Employee :  IsDay e Employee (armazenando os dados de um funcionário para por na pilha).

 Métodos de Schedule : Dayof$ e Schedule(armazenando a agenda de um funcionário para por na pilha).

 Métodos de PayrollGUI : PayrollGUI, initComponents, copy_to_stack,search(para achar empregados),WasDay,WillBeDay,jButton1ActionPerformed,main

 Métodos de PayrollGUI (parte 2) : jButton2ActionPerformed,jButton3ActionPerformed,jButton4ActionPerformed,jButton5ActionPerformed

 Métodos de PayrollGUI (parte 3) : jButton6ActionPerformed,jButton7ActionPerformed,jButton8ActionPerformed,jbutton9ActionPerformed

 Métodos de PayrollGUI (parte 4) : jButton10ActionPerformed,jButton11ActionPerformed,jButton12ActionPerformed,jButton13ActionPerformed.

 Métodos de EditEmpGUI :  EditEmpGUI,initComponents,main,jButton1ActionPerformed,jButton2ActionPerformed,jButton3ActionPerformed.

 Métodos de ScheduleGUI : ScheduleGUI,initComponents,main,jButton1ActionPerformed,jButton2ActionPerformed,jButton3ActionPerformed,jButton4ActionPerformed,search(achar agendas já existentes).

  
  Employee:

    IsDay(linha 123): está na classe Employee, pois já descobre se aquele empregado em particular deve ser pago hoje.

    Employee(não Default)(linha 151) : Está na classe Employee pois é o construtor da mesma.

   Schedule: 

    Dayof$ (linha 53) : Está na classe Schedule , pois ele verifica se um funcionário que tem como agenda "mensal $(padrão de empregados assalariados)" , deve-se calcular todo mês o dia de pagamento.

    Schedule(não default)(linha 66) : Está na classe Schedule , pois é um construtor secundário.

    PayrollGUI :

    PayrollGUI (linha 25): é o construtor da classe.

    initComponents (PayrollGUI) (linha 44): inicia todos os componentes da interface gráfica atrelada.

    copy_to_stack (linha 28) : está em PayrollGUI pois as pilhas usadas estão na mesma classe , logo a alteração seria nesta classe.

    search (linha 411): está em PayrollGUI , pois é o método que procura os empregados , e caso não exista é resolvido na mesma , sem necessidade de estar em outra.

    WasDay (linha 607: Diz se o estado no topo da pilha  de desfazer irá desfazer a rodagem da folha de pagamento.

    WillBeDay (linha 619): Diz se o estado no topo da pilha de refazer irá refazer a rodagem da folha de pagamento.

    jButton1ActionPerformed(PayrollGUI) (linha 353) : está nesta classe para adicionar um empregado na lista presente na mesma.

    jButton2ActionPerformed(PayrollGUI) (linha 345) : está na classe para apagar o que foi escrito nos componentes editáveis presentes.

    jButton3ActionPerformed(PayrollGUI) (linha 387) : está na classe para remover um empregado , fazendo o uso de search , a qual está na mesma classe , e da lista de empregados.

    jButton4ActionPerformed(PayrollGUI) (linha 419) : está nesta classe para lançar um cartão de ponto de um empregado , usando search , alem de ser uma ação realizada por um componente desta classe.

    jButton5ActionPerformed (linha 449) : faz uso de métodos da classe e variáveis privadas da mesma para mandar o resultado da venda.

    jButton6ActionPerformed (linha 474) : faz uso de search para por uma taxa em um empregado.

    jButton7ActionPerformed (linha 553) : faz uso da lista de empregados e de search , ambos tambem na mesma classe, para fazer a construção da classe EditEmpGUI , assim editando um empregado.

    jButton8ActionPerformed (linha 493) : faz uso da lista de empregados para rodar a folha , por isso consta na classe PayrollGUI.

    jButton9ActionPerformed (linha 578) : faz uso da pilha de desfazer , que é usada somente nesta classe  e da lista de empregados , para desfazer a ultima ação.

    jButton10ActionPerformed (linha 593) : faz uso da pilha de refazer , que é usada somente nesta classe e da lista de empregados, para refazer a ultima ação desfeita.

    jButton11ActionPerformed (linha 554) : faz uso da lista de empregados e da lista de agendas de pagamento , que constam somente nesta classe e na main , para alterar informações das agendas de pagamento. 

    jButton12ActionPerformed (linha 511) : Está na classe para colocar um empregado da lista no sindicato , e como a lista consta nesta classe o método fica na mesma.

    jButton13ActionPerformed (linha 444): Está na classe pois é o método que fecha o sistema , e como a classe é a principal classe de interface gráfica , está nela;

    main (linha 634): Faz a interface começar a rodar,

  EditEmpGUI :

    EditEmpGUI (linha 17) : é o construtor da classe.

    initComponents (linha 27) : inicializa os componentes contidos na classe (dando suas posições, seus textos,etc).

    main (linha 172) : faz a interface começar a rodar.

    jButton1ActionPerformed (linha 138) : muda a informação do empregado atrelado á janela aberta(formada pela classe).

    jButton2ActionPerformed (linha 128) : apaga as informações escritas no campo de texto da janela da classe.

    jButton3ActionPerformed (linha 133): fecha a janela correspondente á essa classe.

  ScheduleGUI :

    ScheduleGUI (linha 19) : é o construtor da classe.

    initComponents (linha 29) : inicia os componentes da classe , dando as posições,cores,textos,etc.

    main (linha 196) : faz a interface rodar.

    search (linha 156) : procura uma agenda pelo seu nome para associar ao empregado que solicitou a mudança , que ocorre em outros métodos da classe.

    jButton1ActionPerformed (linha 164) : altera a agenda de pagamento do empregado atrelado à variável da janela.

    jButton2ActionPerformed (linha 152) : apaga o que foi escrito no campo de texto da janela da classe.

    jButton3ActionPerformed (linha 186) : Cria uma nova agenda e põe na lista atrelada á classe.

    jButton4ActionPerformed (linha 147) : fecha a janela atrelada á classe.	

-Reuso

  search (PayrollGUI)(utilizado em outros seis métodos):

   .Motivação: Descobrir se um empregado está na lista e saber o seu indice.

   .Solução : percorrer o array procurando o número de empregado,retornando -1 caso não exista.

   .Vantagem : une um possivel metodo de saber se o array contem um empregado com um de retorna o indice.

   .Desvantagem : tempo de execução muito grande , caso haja muitos empregados.


-Métodos de desfazer/refazer : 

    .Desfazer(jButton9ActionPerformed) : 

         .Motivação : Poder desfazer uma ação cometida por acidente , como remover o empregado errado.

         .Solução : Criar uma pilha com os estados dos empregados e sempre que algo for alterado , por no topo da pilha o novo estado.

         .Vantagem : Permitir que o usuário desfaça uma ação cometida acidentalmente.

         .Desvantagem : Por necessitar que vários arraylists de empregados sejam feitos , há um gasto de memória grande.

    .Refazer(jButton10ActionPerformed) :

         .Motivação : Poder refazer uma ação desfeita.

         .Solução : Criar uma pilha com os estados dos empregados e sempre que algo for alterado, esvaziar a pilha, e sempre que uma ação for desfeita , por o estado dos empregados no topo da pilha.

         .Vantagem : Permitir que as ações de Desfazer possam ser desfeitas em caso de acidentalmente desfazer algo a mais.

         .Desvantagem : Por precisar de vários arraylists de empregados sejam feitos , há um gasto de memória grande.



-Tratamento de erro :

     NumberFormatException :

      .Motivação : Impedir de o usuário do sistema coloque algo que não seja um número esperado , exemplo : esperar um número inteiro e vir um double.

      .Solução : O uso desse tratamento de erro impede de algo inesperado causar problemas no sistema, como colocar uma frase ao invés do salário.

      .Vantagem : O sistema não dar problema caso algo inesperado aconteça e fechar.

-Polimorfismo :

     Employee , construtor não default :

      .Motivação : Criar uma cópia de um empregado para por na pilha.

      .Solução : Guarda os dados de um empregado empregado para por na pilha;

      .Vantagem : Facilidade para desfazer/refazer uma ação.

      .Desvantagem : Muito gasto de memória.

     Schedule , construtor não default :

      .Motivação : Criar uma cópia de uma agenda de um funcionário para por na pilha.

      .Solução : Guarda os dados da agenda de um funcionário.

      .Vantagem : Facilidade para desfazer/refazer uma ação.

      .Desvantagem : Muito gasto de memória.

