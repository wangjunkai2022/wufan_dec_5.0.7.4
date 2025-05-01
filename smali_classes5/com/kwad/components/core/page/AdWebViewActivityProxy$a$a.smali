.class public final Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private OJ:Ljava/lang/String;

.field private OL:Ljava/lang/String;

.field private OM:Lcom/kwad/sdk/core/response/model/AdResultData;

.field private OO:Z

.field private OP:I

.field private OQ:Z

.field private OR:Z

.field private adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OP:I

    return-void
.end method


# virtual methods
.method public final aC(Z)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OR:Z

    return-object p0
.end method

.method public final aD(Z)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OO:Z

    return-object p0
.end method

.method public final aE(Z)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OQ:Z

    return-object p0
.end method

.method public final at(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method public final at(Ljava/lang/String;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OJ:Ljava/lang/String;

    return-object p0
.end method

.method public final au(Ljava/lang/String;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OL:Ljava/lang/String;

    return-object p0
.end method

.method public final az(I)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OP:I

    return-object p0
.end method

.method public final m(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OM:Lcom/kwad/sdk/core/response/model/AdResultData;

    return-object p0
.end method

.method public final pK()Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;
    .locals 20

    move-object/from16 v0, p0

    .line 1
    iget-object v4, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OM:Lcom/kwad/sdk/core/response/model/AdResultData;

    if-eqz v4, :cond_0

    .line 2
    new-instance v10, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    iget-object v2, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OJ:Ljava/lang/String;

    iget-object v3, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OL:Ljava/lang/String;

    iget-boolean v5, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OR:Z

    iget-boolean v6, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OO:Z

    iget-boolean v7, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OQ:Z

    iget v8, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OP:I

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdResultData;ZZZIB)V

    return-object v10

    .line 3
    :cond_0
    new-instance v1, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    iget-object v12, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OJ:Ljava/lang/String;

    iget-object v13, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OL:Ljava/lang/String;

    iget-object v14, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v15, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OR:Z

    iget-boolean v2, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OO:Z

    iget-boolean v3, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OQ:Z

    iget v4, v0, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a$a;->OP:I

    const/16 v19, 0x0

    move-object v11, v1

    move/from16 v16, v2

    move/from16 v17, v3

    move/from16 v18, v4

    invoke-direct/range {v11 .. v19}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;ZZZIB)V

    return-object v1
.end method
