Virtual Poker Chips
======

* _class_ user
  * _string_ userID
  * _float_ points
  * _float_ pointsChange
  * **string** getUserID()
  * **float** getPoints()
  * **float** getChange()
  * **void** updateChange(_float_)
  * **void** updatePoints(_float_)
  * **String** toString()

* _class_ jackpot **extends** user

* _class_ driver
  * **void** 
  * **void** sendPoints(_float_)
  * **void** receivePoints(_float_)
  * **void** update()

* _class_ displayChips
  * **void** getUsers()
  * **void** displayPoints()
