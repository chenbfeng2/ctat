(deftemplate MAIN::button 
   (slot name))
(deftemplate MAIN::hint 
   (slot now))
(deftemplate MAIN::label 
   (slot name) 
   (slot value))
(deftemplate MAIN::problem 
   (slot name)
    (multislot subtractor)
    (multislot subtrend)
   (multislot subgoals) 
   (slot done) 
   (slot description))
(deftemplate MAIN::textField 
   (slot name) 
   (slot value))
(deftemplate MAIN::negative
    (multislot subtractor)
    (multislot subtrend))
(deftemplate MAIN::borrow
    (slot borrowValue)
    (slot tensAfterBorrow))
(deftemplate MAIN::finalSub
    (multislot subtractor)
    (multislot subtrend))
(deftemplate subtractor
    (slot name) 
    (multislot tensDigit)
    (multislot onesDigit))
(deftemplate subtrend
    (slot name) 
    (multislot tensDigit)
    (multislot onesDigit))
(deftemplate onesSub
    (multislot onesDigits))
(deftemplate tensSub
    (multislot tensDigits))
(deftemplate studentValues
    (slot selection)
    (slot action)
    (slot input))
; tell productionRules file that templates have been parsed
(provide wmeTypes)
