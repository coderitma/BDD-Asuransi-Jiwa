Feature: Quotation

  Scenario: Request Quotation
    Given req quo masuk ke halaman login "https://demo.guru99.com/insurance/v1/index.php"
    When req quo mengisi email "yanzen@mail.com"
    And req quo mengisi password "123qwe"
    And req quo klik login
    And req quo berada di halaman dashboard
    And klik tab request quotation
    And pilih Breakdowncover "At home"
    And pilih Windscreenrepair "1"
    And masukan incidents "Anu"
    And masukan registration "Anu anu"
    And masukan annual milegae "123"
    And masukan estimated value "34"
    And pilih parking location "Public Place"
    And pilih Start of policy tahun "2015" bulan "December" tanggal "8"
    And klik save quotation
    Then dapat pesan "You have saved this quotation!"