new OmlDocument("MI/IOStream.vpp",
  new OmlSpecifications([
    new OmlClass(
      "IOStream",
      [
        
      ],
      new OmlInheritanceClause([
        "InputStream",
        "OutputStream"
      ],1,16),
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
              "write",
              new OmlOperationType(
                new OmlSeq0Type(new OmlTypeName(new OmlName(
                  nil,
                  "byte",
                  8,
                  23
                ),8,23),8,16),
                new OmlEmptyType(8,33),
                8,
                16
              ),
              [
                new OmlPatternIdentifier("b",9,7)
              ],
              new OmlOperationBody(
                nil,
                false,
                true,
                9,
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
              8,
              8
            ),
            8,
            8
          ),
          new OmlOperationDefinition(
            new OmlAccessDefinition(
              false,
              false,
              new OmlScope(2,11,1),
              11,
              1
            ),
            new OmlExplicitOperation(
              "close",
              new OmlOperationType(
                new OmlEmptyType(11,16),
                new OmlEmptyType(11,23),
                11,
                16
              ),
              [
                
              ],
              new OmlOperationBody(
                nil,
                true,
                false,
                12,
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
              11,
              8
            ),
            11,
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
    new OmlLexem(1,7,433,"IOStream",2),
    new OmlLexem(1,16,329,"is",1),
    new OmlLexem(1,19,404,"subclass",1),
    new OmlLexem(1,28,360,"of",1),
    new OmlLexem(1,31,433,"InputStream",2),
    new OmlLexem(1,42,44,",",0),
    new OmlLexem(1,44,433,"OutputStream",2),
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
    new OmlLexem(8,8,433,"write",2),
    new OmlLexem(8,14,58,":",0),
    new OmlLexem(8,16,390,"seq",1),
    new OmlLexem(8,20,360,"of",1),
    new OmlLexem(8,23,433,"byte",2),
    new OmlLexem(8,29,362,"==>",0),
    new OmlLexem(8,33,40,"(",0),
    new OmlLexem(8,34,41,")",0),
    new OmlLexem(9,1,433,"write",2),
    new OmlLexem(9,6,40,"(",0),
    new OmlLexem(9,7,433,"b",2),
    new OmlLexem(9,8,41,")",0),
    new OmlLexem(9,10,333,"==",0),
    new OmlLexem(9,13,329,"is",1),
    new OmlLexem(9,16,404,"subclass",1),
    new OmlLexem(9,25,383,"responsibility",1),
    new OmlLexem(9,39,59,";",0),
    new OmlLexem(11,1,375,"public",1),
    new OmlLexem(11,8,433,"close",2),
    new OmlLexem(11,14,58,":",0),
    new OmlLexem(11,16,40,"(",0),
    new OmlLexem(11,17,41,")",0),
    new OmlLexem(11,19,362,"==>",0),
    new OmlLexem(11,23,40,"(",0),
    new OmlLexem(11,24,41,")",0),
    new OmlLexem(12,1,433,"close",2),
    new OmlLexem(12,6,40,"(",0),
    new OmlLexem(12,7,41,")",0),
    new OmlLexem(12,9,333,"==",0),
    new OmlLexem(12,12,329,"is",1),
    new OmlLexem(12,15,357,"not",1),
    new OmlLexem(12,19,428,"yet",1),
    new OmlLexem(12,23,398,"specified",1),
    new OmlLexem(12,32,59,";",0),
    new OmlLexem(14,1,298,"end",1),
    new OmlLexem(14,5,433,"IOStream",2)
  ]
)
