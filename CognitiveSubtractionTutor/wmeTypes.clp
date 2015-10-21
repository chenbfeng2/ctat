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
   (multislot finalValues)
   (multislot subgoals) 
   (slot done) 
 ;  (slot description)
   (multislot interface-elements)
)
(deftemplate MAIN::textField 
   (slot name) 
   (slot value))
(deftemplate MAIN::negative
    (multislot subtractor)
    (multislot subtrend))
(deftemplate MAIN::
	(slot name)
    (multislot borrowValue))
(deftemplate MAIN::finalSub
    (multislot subtractor)
    (multislot subtrend))
(deftemplate MAIN::subtractor
    (slot name) 
    (multislot tensDigit)
    (multislot onesDigit))
(deftemplate MAIN::subtrend
    (slot name) 
    (multislot tensDigit)
    (multislot onesDigit))
(deftemplate MAIN::finalValues
    (slot name)
    (slot tensDigit)
    (slot onesDigit))
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