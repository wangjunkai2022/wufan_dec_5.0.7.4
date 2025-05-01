.class public final synthetic Lcom/join/mgps/adapter/j2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/o2;

.field public final synthetic c:Lcom/join/mgps/adapter/o2$i;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/o2;Lcom/join/mgps/adapter/o2$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/j2;->b:Lcom/join/mgps/adapter/o2;

    iput-object p2, p0, Lcom/join/mgps/adapter/j2;->c:Lcom/join/mgps/adapter/o2$i;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/j2;->b:Lcom/join/mgps/adapter/o2;

    iget-object v1, p0, Lcom/join/mgps/adapter/j2;->c:Lcom/join/mgps/adapter/o2$i;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/o2;->d(Lcom/join/mgps/adapter/o2;Lcom/join/mgps/adapter/o2$i;Landroid/view/View;)V

    return-void
.end method
