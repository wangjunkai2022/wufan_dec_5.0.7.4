.class public final synthetic Lcom/join/mgps/adapter/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/CloudArchiveTagAdapter;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/CloudArchiveTagAdapter;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/b;->b:Lcom/join/mgps/adapter/CloudArchiveTagAdapter;

    iput p2, p0, Lcom/join/mgps/adapter/b;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/b;->b:Lcom/join/mgps/adapter/CloudArchiveTagAdapter;

    iget v1, p0, Lcom/join/mgps/adapter/b;->c:I

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/CloudArchiveTagAdapter;->a(Lcom/join/mgps/adapter/CloudArchiveTagAdapter;ILandroid/view/View;)V

    return-void
.end method
