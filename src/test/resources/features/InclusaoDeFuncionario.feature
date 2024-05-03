Feature: Gerenciamento de Funcionários

  @regressivos
  Scenario Outline: Criar um novo funcionário
    Given que estou autenticado como administrador
    When envie uma requisição POST para o path api.funcionarios.
    Then o statusCode será <statusCode>
    Examples:
      | statusCode |
      | 200        |