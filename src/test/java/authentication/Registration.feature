Feature: Authentication 01

  Scenario: Auth 01
    Given Masuk ke halaman register "https://demo.guru99.com/insurance/v1/register.php"
    When Mengisi title "Captain"
    And Mengisi first name "Yanwar"
    And Mengisi surename "Solah"
    And Mengisi phone "0895338098756"
    And Mengisi DOB "1992" dan "November" dan "3"
    And Mengisi jenis lisensi "2"
    And Mengisi periode lisensi "2"
    And Mengisi pekerjaan "Casino Dealer"
    And Mengisi alamat jalan "Jl. Kerusakan"
    And Mengisi kota "Jakarta"
		And Mengisi Negara "Indonesia"
		And Mengisi kode pos "1134"
		And Mengisi email "yanzen@mail.com"
		And Mengisi password "123qwe"
		And Konfirmasi password "123qwe"
    Then Klik create
    