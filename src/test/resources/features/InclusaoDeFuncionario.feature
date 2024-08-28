Feature: Gerenciamento de Funcionários

  @regressivos
  Scenario Outline: Criar um novo funcionário
    Given usuário esteja autenticado como perfil de administrador.
    And fizer uma requisição utilizando o método 'POST' com a rota 'api/v1/create' da api CreateEmployee.
    When passar no body o idEmployees <idEmployees>, firstName <firstName>, lastName <lastName>.
    Then o statusCode será <statusCode>, o statusExecution será <statusExecution> e a mensagem recebida será <message>
    Examples:
      | idEmployees | firstName | lastName  | message                                | statusExecution | statusCode |
      | '500000'    | 'Jurgen'  | 'Lindsey' | 'Successfully! Record has been added.' | 'success'       | 200        |