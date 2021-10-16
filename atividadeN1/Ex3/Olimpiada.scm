;INICIO DO CÓDIGO
;DEFININDO AS NOTAS DE AMBOS ARREMESSADORES E CALCULANDO A MAIOR ENTRE ELAS
(define arremessador11 100.5)
(define arremessador12 99.7)
(define arremessador13 101.3)
(define maiorA1 (max arremessador11 arremessador12 arremessador13))

;ARREMESSADOR 2
(define arremessador21 101.2)
(define arremessador22 99.9)
(define arremessador23 97.4)
(define maiorA2 (max arremessador21 arremessador22 arremessador23))

;LENDO O NOME DE AMBOS ARREMESSADORES E GUARDANDO NAS VARIAVEIS
(print "\n\nInsira o nome do participante 1: ")
(define nome1 (read))
(print "\nInsira o nome do participante 2: ")
(define nome2 (read))

;IMPRESSAO
(print "\n\nVamos começar as apresentações dos resultados da modalidade de Arremesso de Peso.\n")

;IMPRESSAO DOS VALORES ARMAZENADOS NAS VARIAVEIS
(print "Placar de distância dos arremessos de " nome1 ":")
(print "Arremesso 1 = " arremessador11 "\nArremesso 2 = " arremessador12 "\nArremesso 3 = " arremessador13 "\nMaior arremesso: " maiorA1)

;ARREMESSADOR 2
(print "\nPlacar de distância dos arremessos de " nome2 ":")
(print "Arremesso 1 = " arremessador21 "\nArremesso 2 = " arremessador22 "\nArremesso 3 = " arremessador23 "\nMaior arremesso: " maiorA2)

;IF PARA VENCEDOR E EMPATE SEM CRITERIO DE DESEMPATE
(if (equal? maiorA1 maiorA2)
  (print "\nEmpate!")
  )
  (if (> maiorA2 maiorA1)
    (print "\nVencedor: " nome2)
      (print "\nVencedor: " nome1)
)


;DEFININDO AS VARIAVEIS PARA A MODALIDADE DE Ginastica
(define n11 10)
(define n12 9)
(define n13 8)
(define n14 7)
(define n15 6)

;VARIAVEL QUE ARMAZENA A MENOR NOTA E QUE CALCULA O TOTAL SUBTRAINDO A MENOR
(define n1menor (min n11 n12 n13 n14 n15))
(define n1total (+ n11 n12 n13 n14 n15 (- n1menor)))

;GINASTA 2
(define n21 1)
(define n22 2)
(define n23 3)
(define n24 4)
(define n25 5)
(define n2menor (min n21 n22 n23 n24 n25))
(define n2total (+ n21 n22 n23 n24 n25 (- n2menor)))

;IMPRESSAO 
(print "\n\nAgora vamos começar as apresentações dos resultados da modalidade de Ginastica Artistica.")

;PEDE E GUARDA O NOME DE AMBOS PARTICIPANTES
(print "\n\nInsira o nome do participante 1: ")
(define ginasta1 (read))
(print "\nInsira o nome do participante 2: ")
(define ginasta2 (read))

;IMPRESSAO
(print "\n\nVamos começar as apresentações dos resultados da modalidade de Ginastica Artistica.\n")

;IMPRESSAO DE TODAS AS VARIAVEIS DE NOTA E DO TOTAL EM FORMATO DE TABELA
(print "Placar de notas de " ginasta1 ":")
(print "N1 = " n11 "\nN2 = " n12 "\nN3 = " n13 "\nN4 = " n14 "\nN5 = " n15 "\nTotal = " n1total)

;GINASTA 2
(print "\nPlacar de notas de " ginasta2 ":")
(print "N1 = " n21 "\nN2 = " n22 "\nN3 = " n23 "\nN4 = " n24 "\nN5 = " n25 "\nTotal = " n2total)

;IF PARA IMPRESSAO DO VENCEDOR E CASO DE EMPATE
 (if (equal? n1total n2total)
  (print "\nEmpate!")
  )
  (if (> n1total n2total)
    (print "\nVencedor: " ginasta1)
      (print "\nVencedor: " ginasta2)
)

;FINAL DO CÓDIGO