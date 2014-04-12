Virtual Poker Chips
======

* _class_ user
  * _string_ userID
  * _uint/float_ points
  * _int/float_ pointsChange
  * **uint/float** getPoints()
  * **String** toString()
* _class_ jackpot **extends** user

* _class_ driver
  * **void** sendPoints(_uint/float_)
  * **void** receivePoints(_int/float_)
  * **void** update()

* _class_ displayChips
  * **void** getUsers()
  * **void** displayPoints()
