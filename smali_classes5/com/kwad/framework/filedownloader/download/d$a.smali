.class public final Lcom/kwad/framework/filedownloader/download/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/framework/filedownloader/download/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private ahI:Z

.field private ahJ:Ljava/lang/Exception;

.field private ahK:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final be(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/framework/filedownloader/download/d$a;->ahI:Z

    return-void
.end method

.method final bu(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/framework/filedownloader/download/d$a;->ahK:I

    return-void
.end method

.method final f(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/framework/filedownloader/download/d$a;->ahJ:Ljava/lang/Exception;

    return-void
.end method

.method public final getException()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/framework/filedownloader/download/d$a;->ahJ:Ljava/lang/Exception;

    return-object v0
.end method

.method public final uD()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/framework/filedownloader/download/d$a;->ahK:I

    return v0
.end method

.method public final wu()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/framework/filedownloader/download/d$a;->ahI:Z

    return v0
.end method
