new OmlDocument("ComplexTypes.vpp",
  new OmlSpecifications([
    new OmlClass(
      "ComplexTypes",
      [
        
      ],
      nil,
      [
        new OmlTypeDefinitions([
          new OmlTypeDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,5,1),
              5,
              1
            ),
            new OmlComplexType(
              "NatPair",
              [
                new OmlField(
                  "fst",
                  new OmlNatType(6,9),
                  false,
                  6,
                  7
                ),
                new OmlField(
                  "snd",
                  new OmlNatType(7,9),
                  false,
                  7,
                  7
                )
              ],
              new OmlInvariant(
                new OmlPatternIdentifier("p",8,5),
                new OmlBinaryExpression(
                  new OmlFieldSelect(
                    new OmlName(
                      nil,
                      "p",
                      8,
                      10
                    ),
                    new OmlName(
                      nil,
                      "fst",
                      8,
                      12
                    ),
                    8,
                    11
                  ),
                  new OmlBinaryOperator(23,8,16),
                  new OmlFieldSelect(
                    new OmlName(
                      nil,
                      "p",
                      8,
                      18
                    ),
                    new OmlName(
                      nil,
                      "snd",
                      8,
                      20
                    ),
                    8,
                    19
                  ),
                  8,
                  16
                ),
                8,
                1
              ),
              5,
              16
            ),
            5,
            8
          ),
          new OmlTypeDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,10,1),
              10,
              1
            ),
            new OmlComplexType(
              "NatTuple",
              [
                new OmlField(
                  "max",
                  new OmlNatType(11,11),
                  false,
                  11,
                  9
                ),
                new OmlField(
                  "elms",
                  new OmlSeq0Type(new OmlNatType(12,17),12,10),
                  false,
                  12,
                  8
                )
              ],
              nil,
              10,
              17
            ),
            10,
            8
          )
        ],3,1)
      ],
      false,
      1,
      1
    )
  ],0,0),
  [
    new OmlLexem(1,1,275,"class",1),
    new OmlLexem(1,7,433,"ComplexTypes",2),
    new OmlLexem(3,1,420,"types",1),
    new OmlLexem(5,1,375,"public",1),
    new OmlLexem(5,8,433,"NatPair",2),
    new OmlLexem(5,16,289,"::",0),
    new OmlLexem(6,3,433,"fst",2),
    new OmlLexem(6,7,58,":",0),
    new OmlLexem(6,9,352,"nat",1),
    new OmlLexem(7,3,433,"snd",2),
    new OmlLexem(7,7,58,":",0),
    new OmlLexem(7,9,352,"nat",1),
    new OmlLexem(8,1,325,"inv",1),
    new OmlLexem(8,5,433,"p",2),
    new OmlLexem(8,7,333,"==",0),
    new OmlLexem(8,10,433,"p",2),
    new OmlLexem(8,11,46,".",0),
    new OmlLexem(8,12,433,"fst",2),
    new OmlLexem(8,16,313,">",0),
    new OmlLexem(8,18,433,"p",2),
    new OmlLexem(8,19,46,".",0),
    new OmlLexem(8,20,433,"snd",2),
    new OmlLexem(8,23,59,";",0),
    new OmlLexem(10,1,375,"public",1),
    new OmlLexem(10,8,433,"NatTuple",2),
    new OmlLexem(10,17,289,"::",0),
    new OmlLexem(11,3,433,"max",2),
    new OmlLexem(11,9,58,":",0),
    new OmlLexem(11,11,352,"nat",1),
    new OmlLexem(12,3,433,"elms",2),
    new OmlLexem(12,8,58,":",0),
    new OmlLexem(12,10,390,"seq",1),
    new OmlLexem(12,14,360,"of",1),
    new OmlLexem(12,17,352,"nat",1),
    new OmlLexem(12,20,59,";",0),
    new OmlLexem(14,1,298,"end",1),
    new OmlLexem(14,5,433,"ComplexTypes",2)
  ]
)
