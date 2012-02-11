new OmlDocument("MI/io.vpp",
  new OmlSpecifications([
    new OmlClass(
      "IO",
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
            new OmlSimpleType(
              "byte",
              new OmlNatType(5,15),
              nil,
              5,
              15
            ),
            5,
            8
          )
        ],3,1),
        new OmlOperationDefinitions([
          new OmlOperationDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,9,1),
              9,
              1
            ),
            new OmlExplicitOperation(
              "read",
              new OmlOperationType(
                new OmlSeq0Type(new OmlTypeName(new OmlName(
                  nil,
                  "byte",
                  9,
                  22
                ),9,22),9,15),
                new OmlNatType(9,32),
                9,
                15
              ),
              [
                new OmlPatternIdentifier("b",10,6)
              ],
              new OmlOperationBody(
                nil,
                false,
                true,
                10,
                12
              ),
              new OmlOperationTrailer(
                nil,
                nil,
                nil,
                nil,
                0,
                0
              ),
              9,
              8
            ),
            9,
            8
          ),
          new OmlOperationDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,12,1),
              12,
              1
            ),
            new OmlExplicitOperation(
              "write",
              new OmlOperationType(
                new OmlSeq0Type(new OmlTypeName(new OmlName(
                  nil,
                  "byte",
                  12,
                  23
                ),12,23),12,16),
                new OmlEmptyType(12,33),
                12,
                16
              ),
              [
                new OmlPatternIdentifier("b",13,7)
              ],
              new OmlOperationBody(
                nil,
                false,
                true,
                13,
                13
              ),
              new OmlOperationTrailer(
                nil,
                nil,
                nil,
                nil,
                0,
                0
              ),
              12,
              8
            ),
            12,
            8
          ),
          new OmlOperationDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,15,1),
              15,
              1
            ),
            new OmlExplicitOperation(
              "close",
              new OmlOperationType(
                new OmlEmptyType(15,16),
                new OmlEmptyType(15,23),
                15,
                16
              ),
              [
                
              ],
              new OmlOperationBody(
                nil,
                false,
                true,
                16,
                12
              ),
              new OmlOperationTrailer(
                nil,
                nil,
                nil,
                nil,
                0,
                0
              ),
              15,
              8
            ),
            15,
            8
          )
        ],7,1)
      ],
      false,
      1,
      1
    )
  ],0,0),
  [
    new OmlLexem(1,1,275,"class",1),
    new OmlLexem(1,7,433,"IO",2),
    new OmlLexem(3,1,420,"types",1),
    new OmlLexem(5,1,375,"public",1),
    new OmlLexem(5,8,433,"byte",2),
    new OmlLexem(5,13,299,"=",0),
    new OmlLexem(5,15,352,"nat",1),
    new OmlLexem(5,18,59,";",0),
    new OmlLexem(7,1,361,"operations",1),
    new OmlLexem(9,1,375,"public",1),
    new OmlLexem(9,8,433,"read",2),
    new OmlLexem(9,13,58,":",0),
    new OmlLexem(9,15,390,"seq",1),
    new OmlLexem(9,19,360,"of",1),
    new OmlLexem(9,22,433,"byte",2),
    new OmlLexem(9,28,362,"==>",0),
    new OmlLexem(9,32,352,"nat",1),
    new OmlLexem(10,1,433,"read",2),
    new OmlLexem(10,5,40,"(",0),
    new OmlLexem(10,6,433,"b",2),
    new OmlLexem(10,7,41,")",0),
    new OmlLexem(10,9,333,"==",0),
    new OmlLexem(10,12,329,"is",1),
    new OmlLexem(10,15,404,"subclass",1),
    new OmlLexem(10,24,383,"responsibility",1),
    new OmlLexem(10,38,59,";",0),
    new OmlLexem(12,1,375,"public",1),
    new OmlLexem(12,8,433,"write",2),
    new OmlLexem(12,14,58,":",0),
    new OmlLexem(12,16,390,"seq",1),
    new OmlLexem(12,20,360,"of",1),
    new OmlLexem(12,23,433,"byte",2),
    new OmlLexem(12,29,362,"==>",0),
    new OmlLexem(12,33,40,"(",0),
    new OmlLexem(12,34,41,")",0),
    new OmlLexem(13,1,433,"write",2),
    new OmlLexem(13,6,40,"(",0),
    new OmlLexem(13,7,433,"b",2),
    new OmlLexem(13,8,41,")",0),
    new OmlLexem(13,10,333,"==",0),
    new OmlLexem(13,13,329,"is",1),
    new OmlLexem(13,16,404,"subclass",1),
    new OmlLexem(13,25,383,"responsibility",1),
    new OmlLexem(13,39,59,";",0),
    new OmlLexem(15,1,375,"public",1),
    new OmlLexem(15,8,433,"close",2),
    new OmlLexem(15,14,58,":",0),
    new OmlLexem(15,16,40,"(",0),
    new OmlLexem(15,17,41,")",0),
    new OmlLexem(15,19,362,"==>",0),
    new OmlLexem(15,23,40,"(",0),
    new OmlLexem(15,24,41,")",0),
    new OmlLexem(16,1,433,"close",2),
    new OmlLexem(16,6,40,"(",0),
    new OmlLexem(16,7,41,")",0),
    new OmlLexem(16,9,333,"==",0),
    new OmlLexem(16,12,329,"is",1),
    new OmlLexem(16,15,404,"subclass",1),
    new OmlLexem(16,24,383,"responsibility",1),
    new OmlLexem(16,38,59,";",0),
    new OmlLexem(18,1,298,"end",1),
    new OmlLexem(18,5,433,"IO",2)
  ]
)
