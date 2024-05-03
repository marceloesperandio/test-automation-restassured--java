Feature: Gerenciamento de Funcionários

  Scenario Outline: Exclusão de Funcionários.
    Given use o método get para obter informação de funcionários cadastrados no sistema.
    When realizar uma requisição utilizando o endpoint "https://dummy.restapiexample.com/api/v1/employee/" passando no path o id <funcionário>.
#    Then receberei um objeto JSON trazendo na chave data o id,employee_name,employee_salary,employee_age,profile_image
#    And dentro da chave message, a mensagem <message>.
    Examples:
      | idFuncionario |
      | 20            |




