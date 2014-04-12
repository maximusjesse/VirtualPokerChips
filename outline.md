Virtual Poker Chips
======

* _class_ User
  * _String_ userID
  * _float_ points
  * _float_ pointsPushed
  * **String** getUserID()
  * **float** getPoints()
  * **float** getPushed()
  * **boolean** isPlaying()
  * **void** setUserID(_String_)
  * **void** setPointsPushed(_float_)
  * **void** setPoints(_float_)
  * **String** toString()

* _class_ MasterUser **extends** User

* _class_ Jackpot **extends** User

* _class_ Table
  * _User_ currentUser
  * _MasterUser_ masterUser
  * **void** addUser(_String_)
  * **void** setPoints(_User_,_float_)
  * **void** update()
  * **String** scoreboard()

* _class_ DisplayChips
  * **void** getUsers()
  * **void** displayPoints()

* _class_ Driver
  * ??? networking stuff here ???