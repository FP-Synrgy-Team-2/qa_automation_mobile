Feature: Transfer between user
  Scenario: Transfer successfully between user
    Given User is on the Transfer Antar BCA screen
    When User fills the form with the following details:
      | Field                 | Value            |
      | Nomor Rekening Tujuan | 1234567890       |
      | Nominal Transfer      | 1000000          |
      | Catatan               | Pembayaran hutang|
    And User clicks on Lanjutkan
    Then User should see the confirmation screen
