.class public Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;
.super Ljava/lang/Object;
.source "GameCommentAdapterV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameCommentAdapterV2$l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/join/mgps/dto/InformationCommentBeanV2;

.field public c:I

.field public d:Z

.field public e:I

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/join/mgps/dto/InformationCommentBeanV2;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    .line 4
    iput p3, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->c:I

    .line 5
    iput-boolean p4, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$l$b;->d:Z

    return-void
.end method
