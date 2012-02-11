new OmlDocument("MI/OutputStream.vpp",
  new OmlSpecifications([
    new OmlClass(
      "OutputStream",
      [
        
      ],
      new OmlInheritanceClause([
        "IO"
      ],1,20),
      [
        new OmlOperationDefinitions([
          new OmlOperationDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,5,1),
              5,
              1
            ),
            new OmlExplicitOperation(
              "write",
              new OmlOperationType(
                new OmlSeq0Type(new OmlTypeName(new OmlName(
                  nil,
                  "byte",
                  5,
                  23
                ),5,23),5,16),
                new OmlEmptyType(5,32),
                5,
                16
              ),
              [
                new OmlPatternIdentifier("b",6,7)
              ],
              new OmlOperationBody(
                nil,
                true,
                false,
                6,
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
              5,
              8
            ),
            5,
            8
          ),
          new OmlOperationDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,8,1),
              8,
              1
            ),
            new OmlExplicitOperation(
              "close",
              new OmlOperationType(
                new OmlEmptyType(8,16),
                new OmlEmptyType(8,23),
                8,
                16
              ),
              [
                
              ],
              new OmlOperationBody(
                nil,
                true,
                false,
                9,
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
              8,
              8
            ),
            8,
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
    new OmlLexem(1,7,433,"OutputStream",2),
    new OmlLexem(1,20,329,"is",1),
    new OmlLexem(1,23,404,"subclass",1),
    new OmlLexem(1,32,360,"of",1),
    new OmlLexem(1,35,433,"IO",2),
    new OmlLexem(3,1,361,"operations",1),
    new OmlLexem(5,1,375,"public",1),
    new OmlLexem(5,8,433,"write",2),
    new OmlLexem(5,14,58,":",0),
    new OmlLexem(5,16,390,"seq",1),
    new OmlLexem(5,20,360,"of",1),
    new OmlLexem(5,23,433,"byte",2),
    new OmlLexem(5,28,362,"==>",0),
    new OmlLexem(5,32,40,"(",0),
    new OmlLexem(5,33,41,")",0),
    new OmlLexem(6,1,433,"write",2),
    new OmlLexem(6,6,40,"(",0),
    new OmlLexem(6,7,433,"b",2),
    new OmlLexem(6,8,41,")",0),
    new OmlLexem(6,10,333,"==",0),
    new OmlLexem(6,13,329,"is",1),
    new OmlLexem(6,16,357,"not",1),
    new OmlLexem(6,20,428,"yet",1),
    new OmlLexem(6,24,398,"specified",1),
    new OmlLexem(6,33,59,";",0),
    new OmlLexem(8,1,375,"public",1),
    new OmlLexem(8,8,433,"close",2),
    new OmlLexem(8,14,58,":",0),
    new OmlLexem(8,16,40,"(",0),
    new OmlLexem(8,17,41,")",0),
    new OmlLexem(8,19,362,"==>",0),
    new OmlLexem(8,23,40,"(",0),
    new OmlLexem(8,24,41,")",0),
    new OmlLexem(9,1,433,"close",2),
    new OmlLexem(9,6,40,"(",0),
    new OmlLexem(9,7,41,")",0),
    new OmlLexem(9,9,333,"==",0),
    new OmlLexem(9,12,329,"is",1),
    new OmlLexem(9,15,357,"not",1),
    new OmlLexem(9,19,428,"yet",1),
    new OmlLexem(9,23,398,"specified",1),
    new OmlLexem(9,32,59,";",0),
    new OmlLexem(11,1,298,"end",1),
    new OmlLexem(11,5,433,"OutputStream",2)
  ]
)
