.class public final Lcom/kwad/components/core/j/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/j/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final MP:Lcom/kwad/components/core/j/a$c;

.field public MQ:Z


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/j/a$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/j/a$b;->MP:Lcom/kwad/components/core/j/a$c;

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/core/j/a$b;)Lcom/kwad/components/core/j/a$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/j/a$b;->MP:Lcom/kwad/components/core/j/a$c;

    return-object p0
.end method
