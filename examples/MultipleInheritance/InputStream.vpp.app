new OmlDocument("MI/InputStream.vpp",
  new OmlSpecifications([
    new OmlClass(
      "InputStream",
      [
        
      ],
      new OmlInheritanceClause([
        "IO"
      ],1,19),
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
              "read",
              new OmlOperationType(
                new OmlSeq0Type(new OmlTypeName(new OmlName(
                  nil,
                  "byte",
                  5,
                  22
                ),5,22),5,15),
                new OmlNatType(5,31),
                5,
                15
              ),
              [
                new OmlPatternIdentifier("b",6,6)
              ],
              new OmlOperationBody(
                nil,
                true,
                false,
                6,
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
    new OmlLexem(1,7,433,"InputStream",2),
    new OmlLexem(1,19,329,"is",1),
    new OmlLexem(1,22,404,"subclass",1),
    new OmlLexem(1,31,360,"of",1),
    new OmlLexem(1,34,433,"IO",2),
    new OmlLexem(3,1,361,"operations",1),
    new OmlLexem(5,1,375,"public",1),
    new OmlLexem(5,8,433,"read",2),
    new OmlLexem(5,13,58,":",0),
    new OmlLexem(5,15,390,"seq",1),
    new OmlLexem(5,19,360,"of",1),
    new OmlLexem(5,22,433,"byte",2),
    new OmlLexem(5,27,362,"==>",0),
    new OmlLexem(5,31,352,"nat",1),
    new OmlLexem(6,1,433,"read",2),
    new OmlLexem(6,5,40,"(",0),
    new OmlLexem(6,6,433,"b",2),
    new OmlLexem(6,7,41,")",0),
    new OmlLexem(6,9,333,"==",0),
    new OmlLexem(6,12,329,"is",1),
    new OmlLexem(6,15,357,"not",1),
    new OmlLexem(6,19,428,"yet",1),
    new OmlLexem(6,23,398,"specified",1),
    new OmlLexem(6,32,59,";",0),
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
    new OmlLexem(12,1,298,"end",1),
    new OmlLexem(12,5,433,"InputStream",2)
  ]
)
