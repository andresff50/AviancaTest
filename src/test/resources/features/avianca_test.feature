Feature: Buscar vuelo en la plataforma de vuelos de Avianca

  Scenario Outline: Seleccionar un vuelo en la pagina Avianca
    Given que ingreso a la pagina Avianca
    When realizo la busqueda de un vuelo con la informacion de la <hoja> y <fila>
    Then verifico la informacion del vuelo

    Examples:
      | hoja | fila |
      | 0    | 1    |
