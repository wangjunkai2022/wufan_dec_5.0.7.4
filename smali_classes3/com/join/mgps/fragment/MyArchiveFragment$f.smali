.class Lcom/join/mgps/fragment/MyArchiveFragment$f;
.super Ljava/lang/Object;
.source "MyArchiveFragment.java"

# interfaces
.implements Lcom/join/mgps/fragment/MyArchiveFragment$w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MyArchiveFragment;->z0(Ljava/util/List;ZLcom/join/mgps/fragment/MyArchiveFragment$w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/MyArchiveFragment$w;

.field final synthetic b:Lcom/join/mgps/fragment/MyArchiveFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment;Lcom/join/mgps/fragment/MyArchiveFragment$w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$f;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/MyArchiveFragment$f;->a:Lcom/join/mgps/fragment/MyArchiveFragment$w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/join/mgps/dto/CloudListDataBean;)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment$f;->a:Lcom/join/mgps/fragment/MyArchiveFragment$w;

    invoke-interface {v0, p1, p2}, Lcom/join/mgps/fragment/MyArchiveFragment$w;->a(ZLcom/join/mgps/dto/CloudListDataBean;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$f;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget p2, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->M:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/join/mgps/fragment/MyArchiveFragment;->M:I

    :cond_1
    :goto_0
    return-void
.end method
