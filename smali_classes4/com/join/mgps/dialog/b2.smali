.class public final synthetic Lcom/join/mgps/dialog/b2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/dialog/c2;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/dialog/c2;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/dialog/b2;->b:Lcom/join/mgps/dialog/c2;

    iput-object p2, p0, Lcom/join/mgps/dialog/b2;->c:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/join/mgps/dialog/b2;->d:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/dialog/b2;->b:Lcom/join/mgps/dialog/c2;

    iget-object v1, p0, Lcom/join/mgps/dialog/b2;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/dialog/b2;->d:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/dialog/c2;->b(Lcom/join/mgps/dialog/c2;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method
