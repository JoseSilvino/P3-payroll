-Funcionalidades

 O projeto Folha de Pagamento é um sistema de administração de funcionários , onde é possivel :

 Adicionar Funcionários. (métodojButton1ActionPerformed da classe PayrollGUI)

 Remover Funcionários. (método jButton3ActionPerformed da classe PayrollGUI)

 Lançar o cartão de ponto de um funcionário. (método jButton4ActionPerformed da classe PayrollGUI)

 Lancar o resultado de uma venda feita por um funcionário comissionado. (método jButton5ActionPerformed da classe PayrollGUI)

 Lançar uma taxa de serviço para um funcionario.(método jButton6ActionPerformed da classe PayrollGUI)

 Colocar um empregado no Sindicato. (método jButton12ActionPerformed da classe PayrollGUI) 

 Rodar a folha de pagamento dos funcionários do dia. (método jButton8ActionPerformed da classe PayrollGUI)

 Desfazer uma das ações acima. (método jButton9ActionPerformed da classe PayrollGUI)

 Refazer uma das ações desfeita anteriormente. (método jButton10ActionPerformed da classe PayrollGUI)

 Mudar a agenda de pagamento de um funcionário. (método jButton11ActionPerformed da classe PayrollGUI)

 Criar um novo tipo de agenda de funcionários. (método jButton11ActionPerformed da classe PayrollGUI)

 Mudar detalhes de um empregado. (método jButton7ActionPerformed da classe PayrollGUI)

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

      .Vantagem : 

    
     Classe Salaried :

      .Motivação : Necessidade de armazenar dados de um funcionário assalariado.

      .Solução : A classe armazena os dados de um funcionário assalariado, tendo as informações exclusivas do tipo.

      .Vantagem :

    
     Classe Commisioned :

      .Motivação : Necessidade de amazenar dados de um funcionário comissionado.

      .Solução : A classe armazena os dados de um funcionário comissionado , contendo as informações do tipo.

      .Vantagem : 


 Classe PayrollRefactored :

      .Motivação : Ser a classe principal do sistema , inicializando as restantes.

      .Solução : Com esta classe , a chamada das restantes se torna mais organizada.

      .Vantagem : Maior organização da estrutura do código.

      .Desvantagem : Pouca quantidade de coisas a s fazer nela.


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

      .Vantagem : Possibilidade de escolha de forma mais simples.


 Classe ScheduleGUI:

      .Motivação : Possibilitar o empregado de escolher uma das agendas criadas com Schedule.

      .Solução : Uma lista mostrando as agendas disponíveis , e caso o empregado queira , a criação de uma nova.

      .Vantagem : Possibilidade de criar/mudar de agenda de forma mais simples.



-Extensibilidade:

      .Motivação : A necessidade de trabalhar com objetos muito parecidos, os tipos de empregado.

      .Solução : Fazer esses objetos serem herdarem da mesma classe o que tinham em comum.

      .Vantagem : A não necessidade de criar váriaz classes parecidas, ao invés disso criar uma subclasse da classe que contem as semelhanças.



-Distribuição dos Métodos :

 Métodos de Employee :  IsDay e Employee (armazenando os dados de um funcionário para por na pilha).

 Métodos de Schedule : Dayof$ e Schedule(armazenando a agenda de um funcionário para por na pilha).

 Métodos de PayrollGUI : PayrollGUI, initComponents, copy_to_stack,search,WasDay,WillBeDay,jButton1ActionPerformed,main

 Métodos de PayrollGUI (parte 2): jButton2ActionPerformed,jButton3ActionPerformed,jButton4ActionPerformed,jButton5ActionPerformed

 Métodos de PayrollGUI (parte 3): jButton6ActionPerformed,jButton7ActionPerformed,jButton8ActionPerformed,jbutton9ActionPerformed

 Métodos de PayrollGUI (parte 4 : jButton10ActionPerformed,jButton11ActionPerformed,jButton12ActionPerformed,jButton13ActionPerformed.

 Métodos de EditEmpGUI :  EditEmpGUI,initComponents,main,jButton1ActionPerformed,jButton2ActionPerformed,jButton3ActionPerformed.

 Métodos de ScheduleGUI : ScheduleGUI,initComponents,main,jButton1ActionPerformed,jButton2ActionPerformed,jButton3ActionPerformed,jButton4ActionPerformed.

  
  Employee:

    IsDay: está na classe Employee, pois já descobre se aquele empregado em particular deve ser pago hoje.

    Employee(não Default) : Está na classe Employee pois é o construtor da mesma.

   Schedule: 

    Dayof$ : Está na classe Schedule , pois ele verifica se um funcionário que tem como agenda "mensal $(padrão de empregados assalariados)" , deve-se calcular todo mês o dia de pagamento.

    Schedule(não default) : Está na classe Schedule , pois é um construtor secundário.

    PayrollGUI :

    PayrollGUI : é o construtor da classe.

    initComponents (PayrollGUI): inicia todos os componentes da interface gráfica atrelada.

    copy_to_stack : está em PayrollGUI pois as pilhas usadas estão na mesma classe , logo a alteração seria nesta classe.

    search : está em PayrollGUI , pois é o método que procura os empregados , e caso não exista é resolvido na mesma , sem necessidade de estar em outra.

    WasDay : Diz se o estado no topo da pilha  de desfazer foi um dia antes (a folha de pagamento foi rodada).

    WillBeDay : Diz se o estado no topo da pilha de refazer será no proximo dia (a folha de pagamento foi rodada).

    jButton1ActionPerformed(PayrollGUI) : esta nesta classe para adicionar um empregado na lista que está nesta classe por ser a principal.

    jButton2ActionPerformed(PayrollGUI) : está na classe para apagar o que foi escrito nos componentes que permitem edição da mesma.

    jButton3ActionPerformed(PayrollGUI) : está na classe para remover um empregado , fazendo o uso de search , a qual está na mesma classe.

    jButton4ActionPerformed(PayrollGUI) : está nesta classe para lançar um cartão de ponto de um empregado , usando search , alem de ser uma ação realizada por um componente desta classe.

    jButton5ActionPerformed: faz uso de métodos da classe e está ligado a um componente da mesma para mandar o resultado da venda.

    jButton6ActionPerformed: faz uso de search para por a taxa em um empregado.

    jButton7ActionPerformed: faz uso da lista de empregados e de search , ambos tambem na mesma classe.

    jButton8ActionPerformed: faz uso da lista de empregados e por isso consta na classe PayrollGUI.

    jButton9ActionPerformed: faz uso da pilha de desfazer , que é usada somente nesta classe , e da lista de empregados.

    jButton10ActionPerformed : faz uso da pilha de refazer , que é usada somente nesta classe, e da lista de empregados.

    jButton11ActionPerformed : faz uso da lista de empregados e da lista de agendas de pagamento , que constam somente nesta classe e na main. 

    jButton12ActionPerformed : Está na classe para colocar um empregado da lista no sindicato , e como a lista consta nesta classe o método fica na mesma.

    jButton13ActionPerformed : Está na classe pois é o método que fecha o sistema , e como a classe é a principal classe de interface gráfica , está nela;

    main : Faz a interface começar a rodar,

  EditEmpGUI :

    EditEmpGUI : é o construtor da classe.

    initComponents : inicializa os componentes contidos na classe (dando suas posições, seus textos,etc).

    main : faz a interface começar a rodar.

    jButton1ActionPerformed: muda a informação do empregado atrelado á janela aberta(formada pela classe).

    jButton2ActionPerformed : apaga as informações escritas no campo de texto da janela da classe.

    jButton3ActionPerformed : fecha a janela correspondente á essa classe.

  ScheduleGUI :

    ScheduleGUI : é o construtor da classe.

    initComponents : inicia os componentes da classe , dando as posições,cores,textos,etc.

    main : faz a interface rodar.

    jButton1ActionPerformed : altera a agenda de pagamento do empregado atrelado à variável da janela.

    jButton2ActionPerformed : apaga o que foi escrito no campo de texto da janela da classe.

    jButton3ActionPerformed : Cria uma nova agenda e põe na lista atrelada á classe.

    jButton4ActionPerformed : fecha a janela atrelada á classe.	

-Reuso

 IsDay :

  .Motivação : Descobrir se o dia atual é o dia do pagamento de um funcionário.

  .Solução : Com a variável contendo o dia atual , pode-se usar este método para saber se está no dia de pagamento.

  .Vantagem : Descobre rápidamente se está no dia de pagar um funcionário.

  search :

   .Motivação: Descobrir se um empregado está na lista e saber o seu indice.

   .Solução : percorrer o array procurando o número de empregado,retornando -1 caso não exista.

   .Vantagem : une um possivel metodo de saber se o array contem um empregado com um de retorna o indice.

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

      Solução : Guarda os dados da agenda de um funcionário.

      Vantagem : Facilidade para desfazer/refazer uma ação.

      Desvantagem : Muito gasto de memória.

