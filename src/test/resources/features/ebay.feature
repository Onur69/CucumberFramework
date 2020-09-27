Feature: Ebay Arama
  @ebay #senayarmuzun "tag" değeri.
  Scenario: TC01_kullanici ebayda urun arar
    Given kullanici "https://ebay.com" sayfasina gider
    And kullanici aramakutusuna "stroller" yazar
    Then kullanici sonucsayisini ekrana yazar