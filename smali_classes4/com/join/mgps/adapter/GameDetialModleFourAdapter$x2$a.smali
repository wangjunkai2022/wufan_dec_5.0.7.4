.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2$a;
.super Ljava/lang/Object;
.source "GameDetialModleFourAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2$a;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2$a;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$x2;->e:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->m:Lw1/i;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lw1/i;->C()V

    :cond_0
    return-void
.end method
