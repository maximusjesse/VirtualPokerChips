Virtual Poker Chips
======

* _class_ User
  * _String_ userID
  * _float_ points
  * _float_ pointsPushed
  * _boolean_ playing
  * **String** getUserID()
  * **float** getPoints()
  * **float** getPushed()
  * **boolean** isPlaying()
  * **void** setUserID(_String_)
  * **void** pushPoints(_float_)
  * **void** receivePoints(_float_)

    Recieve the points gained that round and reset the pointsPushed. Losing hands recieve 0 points.

  * **String** toString()

* _class_ MasterUser **extends** User

* _class_ Jackpot **extends** User

* _class_ Table
  * _User_ currentUser
  * _MasterUser_ masterUser
  * **void** addUser(_String_)
  * **void** sendPoints(_float_)
  * **void** receivePoints(_float_)
  * **void** update()

* _class_ DisplayChips
  * **void** getUsers()
  * **void** displayPoints()

* _class_ Driver
  * ??? networking stuff here ???